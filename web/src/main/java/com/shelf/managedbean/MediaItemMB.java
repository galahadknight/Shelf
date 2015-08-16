package com.shelf.managedbean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.shelf.dao.MediaItem;
import com.shelf.ejb.ItemEJB;

@ManagedBean
@ViewScoped
public class MediaItemMB implements Serializable {

	private static final long serialVersionUID = -501507917007620277L;

	@EJB
	ItemEJB itemEjb;
	
	private List<MediaItem> lstMediaItem = new ArrayList<MediaItem>();
	
	private String paramMediaName;
	
	@PostConstruct
	public void init() {
//		lstMediaItem = itemEjb.findAll();
	}

	public List<MediaItem> getLstMediaItem() {
		return lstMediaItem;
	}

	public void setLstMediaItem(List<MediaItem> lstMediaItem) {
		this.lstMediaItem = lstMediaItem;
	}
	
	public void cmdSearchMediaItem() {
		lstMediaItem = itemEjb.findAllMedia();
		System.out.println("MediaItemMB.cmdSearchMediaItem()");
	}
	
	public void cmdSearchMediaItem(String mediaName) {
		lstMediaItem = itemEjb.findMediaItemByName(mediaName);
		System.out.println("MediaItemMB.cmdSearchMediaItem(mediaName)");
	}

	public String getParamMediaName() {
		return paramMediaName;
	}

	public void setParamMediaName(String paramMediaName) {
		this.paramMediaName = paramMediaName;
	}

}
