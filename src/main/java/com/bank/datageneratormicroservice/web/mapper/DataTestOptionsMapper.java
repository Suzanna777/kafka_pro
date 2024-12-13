package com.bank.datageneratormicroservice.web.mapper;

import com.bank.datageneratormicroservice.model.test.DataTestOptions;
import com.bank.datageneratormicroservice.web.dto.DataTestOptionsDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DataTestOptionsMapper extends Mappable<DataTestOptions, DataTestOptionsDto> {
}
