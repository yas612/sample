package com.q12.service;

import java.util.List;

import com.q12.model.Pencil;

public interface PencilServiceImpl {

	Pencil addNewPencil(Pencil pencil);
	Pencil findPencilById(int id);
	List<Pencil> findAllPencil();
	String deleteExistingPencilById(int id);
	Pencil updatePencil(Pencil pencil);
}
