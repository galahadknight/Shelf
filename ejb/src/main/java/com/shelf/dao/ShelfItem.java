package com.shelf.dao;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="shelf_item", schema="db_shelf")
public class ShelfItem extends BaseDAO {

	private static final long serialVersionUID = -5908080109529282346L;
	
	private MediaItem mediaItem;

	public MediaItem getMediaItem() {
		return mediaItem;
	}

	public void setMediaItem(MediaItem mediaItem) {
		this.mediaItem = mediaItem;
	}

}
