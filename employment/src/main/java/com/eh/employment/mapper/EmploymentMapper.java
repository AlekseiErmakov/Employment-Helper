package com.eh.employment.mapper;

import com.eh.employment.api.dto.HiringProcessDto;
import com.eh.employment.model.HiringProcess;
import org.mapstruct.Mapper;

@Mapper
public interface EmploymentMapper {

    HiringProcessDto toHiringProcessDto(HiringProcess hiringProcess);
}
