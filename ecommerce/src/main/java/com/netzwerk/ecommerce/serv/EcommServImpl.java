package com.netzwerk.ecommerce.serv;

import com.netzwerk.ecommerce.dto.EcommDTO;
import com.netzwerk.ecommerce.repo.EcommRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EcommServImpl {

    @Autowired
    private EcommRepo repo;

    public boolean save(EcommDTO dto) {
        repo.save(dto);
        return true;
    }

    public List<EcommDTO> findByModel(String model){
        List<EcommDTO> dto = repo.findByModel(model);
        dto.toString();
        return dto;
    }

    public EcommDTO findById(Integer id) {
        Optional<EcommDTO> ecomDTO = repo.findById(id);
        return ecomDTO.get();
    }

    public Page<EcommDTO> findAll(int pageMin, int pageMax, String sortBy, String sortDirection){
        Sort sort = Sort.by(Sort.Direction.fromString(sortDirection), sortBy);
        Pageable pageable = PageRequest.of(pageMin, pageMax, sort);
        return repo.findAll(pageable);
    }

    public List<EcommDTO> getAllDevices(){

        return repo.findAll();
    }

    public void deleteViaId(Integer id){

        repo.deleteById(id);
    }
}
