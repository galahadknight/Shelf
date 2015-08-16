package com.shelf.ejb;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import com.shelf.dao.MediaItem;

@Stateless
public class ItemEJB {
	
	@PersistenceContext(name="db_shelf")
	private EntityManager entityManager;
	private List<MediaItem> lstMediaItem;

	
	public List<MediaItem> findAll() {
		TypedQuery<MediaItem> query = entityManager.createQuery("select m from MediaItem m", MediaItem.class);
		lstMediaItem = query.getResultList();
		
		return lstMediaItem;
	}
}