package com.artGallery.Evoca.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.artGallery.Evoca.Model.Autor;
import com.artGallery.Evoca.Repository.IAutorRepository;

@Service
public class AutorService {

    @Autowired
    private IAutorRepository autorRepository;

    public Autor insertAutor(Autor autor) {
        return autorRepository.save(autor);
    }

}
