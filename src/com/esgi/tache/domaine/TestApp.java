package com.esgi.tache.domaine;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.esgi.dao.TacheDao;

public class TestApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext beanF = new ClassPathXmlApplicationContext("spring-data.xml") ;
		TacheDao dao = (TacheDao) beanF.getBean("tacheDao");
		Tache t = new Tache(30, "Analyse", 2, "EC") ;
		//dao.saveTache(t);
		
		List<Tache> listeTaches = dao.getAllTaches();
		
		for(Tache tache : listeTaches) {
			System.out.println(tache);
		}
		
		int nbTaches = dao.getTachesCount() ;
		System.out.println(nbTaches);
		
		Tache taches = dao.getTacheById(2) ;
		System.out.println(taches);
	}

}
