package com.prueba.demo.dto.mapper;

import com.prueba.demo.modelo.Tp000004;
import com.prueba.demo.modelo.dto.Tp000004DTO;

import java.util.List;


/**
* @author Zathura Code Generator http://zathuracode.org
* www.zathuracode.org
*
*/
public interface ITp000004Mapper {
    public Tp000004DTO tp000004ToTp000004DTO(Tp000004 tp000004)
        throws Exception;

    public Tp000004 tp000004DTOToTp000004(Tp000004DTO tp000004DTO)
        throws Exception;

    public List<Tp000004DTO> listTp000004ToListTp000004DTO(
        List<Tp000004> tp000004s) throws Exception;

    public List<Tp000004> listTp000004DTOToListTp000004(
        List<Tp000004DTO> tp000004DTOs) throws Exception;
}
