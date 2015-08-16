package com.shelf.ejb;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import com.shelf.dao.MediaItem;
import com.shelf.dao.ShelfItem;

@Stateless
public class ItemEJB {
	
	@PersistenceContext(name="db_shelf")
	private EntityManager entityManager;
	private List<MediaItem> lstMediaItem;

	
	public List<MediaItem> findAllMedia() {
		TypedQuery<MediaItem> query = entityManager.createQuery("select m from MediaItem m", MediaItem.class);
		lstMediaItem = query.getResultList();
		
		return lstMediaItem;
	}
	
	/* Realiza insercao de um objeto ShelfItem. Se o MediaItem associado a ele nao existe no banco, 
	 * realiza insercao dele tambem.*/
	public void insertOrUpdateShelfItem(ShelfItem shelfItem) {
		
		
	}
	
	public List<MediaItem> findMediaItemByName(String mediaName) {
		TypedQuery<MediaItem> query = entityManager
				.createQuery("select m from MediaItem m where upper(m.name) like '%' || upper(:mediaName) || '%'", MediaItem.class);
		query.setParameter("mediaName", mediaName);
		
		lstMediaItem = query.getResultList();
		return lstMediaItem;
	}
}