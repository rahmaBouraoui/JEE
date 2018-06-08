package com.esgi.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;

import com.esgi.tache.domaine.Tache;

public class TacheDao implements ITacheDao {
	
	private JdbcTemplate jdbcTemplate ;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public Tache getTacheById(int id) {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM tache where id = " + id;
		List<Map<String,Object>> rows = jdbcTemplate.queryForList(sql);
		if(rows.size() != 0) {
			Tache t = new Tache();
			
			t.setId((int)(rows.get(0).get("id")));
			t.setLibelle((String)rows.get(0).get("libelle"));
			t.setPriorite((int)rows.get(0).get("priorite"));
			t.setEtat((String)rows.get(0).get("etat"));
			
			
			return t;
		}
		else {
			return null ;
		}
	}

	@Override
	public void saveTache(Tache tache) {
		// TODO Auto-generated method stub
		final String tacheInsert = "Insert into tache values(?, ?, ?, ?)";
		jdbcTemplate.update(tacheInsert, new Object[] { tache.getId(), tache.getLibelle(), tache.getPriorite(), tache.getEtat() });
		
	}

	@Override
	public int getTachesCount() {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM tache";
		List<Map<String,Object>> rows = jdbcTemplate.queryForList(sql);
		return rows.size();
	}

	@Override
	public List<Tache> getAllTaches() {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM tache";
		 
		List<Tache> taches = new ArrayList<Tache>();
		
		List<Map<String,Object>> rows = jdbcTemplate.queryForList(sql);
		for (Map<String,Object> row : rows) {
			Tache t = new Tache();
			t.setId((int)(row.get("id")));
			t.setLibelle((String)row.get("libelle"));
			t.setPriorite((int)row.get("priorite"));
			t.setEtat((String)row.get("etat"));
			taches.add(t);
		}
			
		return taches;
	}
	
	
	
	

}
