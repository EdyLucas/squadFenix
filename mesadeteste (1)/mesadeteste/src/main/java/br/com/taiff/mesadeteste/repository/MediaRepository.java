package br.com.taiff.mesadeteste.repository;


import java.util.List;
import java.util.stream.Collectors;

import javax.persistence.EntityManager;

import org.springframework.stereotype.Repository;

import br.com.taiff.mesadeteste.model.Temperatura;

@Repository
public class MediaRepository {
	
	private final EntityManager em;
	
	public MediaRepository(EntityManager em) {
		this.em = em;
	}

	public List<Temperatura> findJ1(Long id){
		int n1 = 191;
		int n2 = 274;
		
		String query = "select T.id from Temperatura T where T.id between " +n1+" and "+n2;
		
		var q = em.createQuery(query, Temperatura.class);
		
		return q.getResultList();
		
	}
	
	public List<Temperatura> findJ2(Long id){
		int n1 = 345;
		int n2 = 456;
		
		String query = "select T from Temperatura T where T.id between " +n1+" and "+n2;
		
		var q = em.createQuery(query, Temperatura.class);
		
		return q.getResultList();
		
	}
	
	public List<Temperatura> findJ3(Long id){
		int n1 = 556;
		int n2 = 653;
		
		String query = "select T from Temperatura T where T.id between " +n1+" and "+n2;
		
		var q = em.createQuery(query, Temperatura.class);
		
		return q.getResultList();
		
	}

	public List<Temperatura> findJ4(Long id){
		int n1 = 734;
		int n2 = 753;
		
		String query = "select T from Temperatura T where T.id between " +n1+" and "+n2;
		
		var q = em.createQuery(query, Temperatura.class);
		
		return q.getResultList();
		
	}

	
	public List<Temperatura> findJ5(Long id){
		int n1 = 754;
		int n2 = 787;
		
		String query = "select T from Temperatura T where T.id between " +n1+" and "+n2;
		
		var q = em.createQuery(query, Temperatura.class);
		
		return q.getResultList();
		
	}
	
	public List<Temperatura> findJ6(Long id){
		int n1 = 806;
		int n2 = 931;
		
		String query = "select T from Temperatura T where T.id between " +n1+" and "+n2;
		
		var q = em.createQuery(query, Temperatura.class);
		
		return q.getResultList();
		
	}
	
	public List<Temperatura> findJ7(Long id){
		int n1 = 1066;
		int n2 = 1186;
		
		String query = "select T from Temperatura T where T.id between " +n1+" and "+n2;
		
		var q = em.createQuery(query, Temperatura.class);
		
		return q.getResultList();
		
	}
	
	public List<Temperatura> findJ8(Long id){
		int n1 = 1268;
		int n2 = 1377;
		
		String query = "select T from Temperatura T where T.id between " +n1+" and "+n2;
		
		var q = em.createQuery(query, Temperatura.class);
		
		return q.getResultList();
		
	}

	public List<Temperatura> findJ9(Long id){
		int n1 = 1442;
		int n2 = 1606;
		
		String query = "select T from Temperatura T where T.id between " +n1+" and "+n2;
		
		var q = em.createQuery(query, Temperatura.class);
		
		return q.getResultList();
		
	}

	
	public List<Temperatura> findJ10(Long id){
		int n1 = 1687;
		int n2 = 1807;
		
		String query = "select T from Temperatura T where T.id between " +n1+" and "+n2;
		
		var q = em.createQuery(query, Temperatura.class);
		
		return q.getResultList();
		
	}



}
