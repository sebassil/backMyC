package com.mitocode.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.ManyToOne;

import LlavesCompuestas.AdiperPK;

@Entity
public class Adiper implements Serializable {
	@EmbeddedId
	private AdiperPK adiperpk;
		
}