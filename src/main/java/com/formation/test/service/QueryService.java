package com.formation.test.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.formation.test.IService.IQueryService;
import com.formation.test.model.StudentDetail;
import com.formation.test.model.StudentDetail2;
import com.formation.test.model.StudentEntity;
import com.formation.test.repositoty.StudentRepository;

@Service
public class QueryService implements IQueryService {

	@Autowired
	StudentRepository studentrepository;

	@Autowired
	EntityManagerFactory emf;

	@Autowired
	EntityManager entityManager;

	@Override
	public List<StudentDetail2> JPQLQuery() {
		EntityManager em = emf.createEntityManager();
		// em.getTransaction().begin( );

		Query query = em.createQuery("Select" + "s.rollNumber,s.name" + "s.age,s.email from StudentEntity");
		@SuppressWarnings("unchecked")
		List<StudentDetail2> list = (List<StudentDetail2>) query.getResultList();
		System.out.println("Student Name :");
		em.close();

		return list;

	}

	public List<StudentEntity> studentAllData() {
		return studentrepository.findAll();
	}
	
	public List<StudentEntity> test0() {

		EntityManager em = emf.createEntityManager();
		String consulta = "SELECT s FROM StudentEntity s";
		List<StudentEntity> liste = em.createQuery(consulta).getResultList();
		em.close();
		
		return liste;
	}
	

	public List<String> test() {

		TypedQuery<String> query = entityManager.createQuery("SELECT name FROM StudentEntity ", String.class);
		List<String> resultList = query.getResultList();
		System.out.println("Taille liste: " + resultList.size());
		System.out.println("----------------------------------------");
		for (String result : resultList) {

			System.out.println(result);
		}
		return resultList;
	}

	public List<StudentEntity> test2() {
		
		System.out.println("----------------------------------------");
		TypedQuery<StudentEntity> query = entityManager.createQuery("Select e FROM StudentEntity e WHERE e.id =1 OR e.id=2", StudentEntity.class);
		List<StudentEntity> resultList = query.getResultList();
		System.out.println("Taille liste: " + resultList.size());
		System.out.println("1er : " + resultList.get(0).getName() );
		
		return resultList;
	}
	
	
public List<StudentEntity> test3() {   // A revoir!!!
		
		System.out.println("----------------------------------------");
		EntityManager em = emf.createEntityManager();
		String consulta = "SELECT s FROM StudentEntity s WHERE s.name='Phil'";
		List<StudentEntity> liste = em.createQuery(consulta).getResultList();
		em.close();
		System.out.println("Student récupéré: " + liste.get(0).getName());
		return liste;
	}
}
