package com.bank.datageneratormicroservice.web.mapper;

import com.bank.datageneratormicroservice.model.Data;
import com.bank.datageneratormicroservice.web.dto.DataDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DataMapper extends Mappable<Data, DataDto> {
}
