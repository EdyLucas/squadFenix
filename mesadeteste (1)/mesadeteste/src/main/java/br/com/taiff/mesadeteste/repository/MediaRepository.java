package br.com.taiff.mesadeteste.repository;


import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.stereotype.Repository;

import br.com.taiff.mesadeteste.model.Temperatura;

@Repository
public class MediaRepository {
	
	private final EntityManager em;
	
	public MediaRepository(EntityManager em) {
		this.em = em;
	}


	float acumt1 = 0;
	float acumt2 = 0;
	float acumt3 = 0;
    float acumt4 = 0;

	/*private float mediaT1;
	private float mediaT2;
	private float mediaT3;
	private float mediaT4;*/

	public List<Temperatura> findJ1(Long id){
		int n1 = 191;
		int n2 = 274;
		
		String query = "select avg(t1) from temperatura T where T.id between 191 and 274";




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

	
	/*public List<Temperatura> findJ10(Long id){
		int n1 = 1687;
		int n2 = 1807;
		
		String query = "select T from Temperatura T where T.id between " +n1+" and "+n2;
		
		var q = em.createQuery(query, Temperatura.class);
		
		return q.getResultList();
		
	}*/

	public float[] findJanela(Long in, Long fin) {
		Long n1 = in;
		Long n2 = fin;

		String query = "select T from Temperatura T where T.id between " + n1 + " and " + n2;

		var q = em.createQuery(query, Temperatura.class);




		for (Temperatura t : q.getResultList()) {
			acumt1 += t.getT1();
			acumt2 += t.getT2();
			acumt3 += t.getT3();
			acumt4 += t.getTAmbiente();

		}
		int qtd = q.getResultList().size();
		float mediaT1 = acumt1 / qtd;
		 float mediaT2 = acumt2 / qtd;
		float mediaT3 = acumt3 / qtd;
		float mediaT4 = acumt4/qtd;

       float[] temperaturaMedia = {mediaT1, mediaT2, mediaT3, mediaT4};

           return temperaturaMedia;


	}


 /*	public float getMediaT1() {
		return mediaT1;
	}

	public float getMediaT2() {
		return mediaT2;
	}

	public float getMediaT3() {
		return mediaT3;
	}

	public float getMediaT4() {
		return mediaT4;
	}*/
}
