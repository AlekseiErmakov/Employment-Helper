package com.eh.employment.service;

import com.eh.employment.api.dto.HiringProcessDto;
import com.eh.employment.api.dto.HiringProcessTableRequest;
import com.eh.employment.mapper.EmploymentMapper;
import com.eh.employment.repository.HiringProcessRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class HiringProcessService {

    private final HiringProcessRepository hiringProcessRepository;
    private final EmploymentMapper employmentMapper;


    public Page<HiringProcessDto> getHiringProcesses(HiringProcessTableRequest request) {
        return hiringProcessRepository.findAll(PageRequest.of(request.pageNumber(), request.pageSize()))
                .map(employmentMapper::toHiringProcessDto);
    }
}
