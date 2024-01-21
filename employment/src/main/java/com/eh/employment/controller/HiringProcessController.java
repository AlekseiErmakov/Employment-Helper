package com.eh.employment.controller;

import com.eh.employment.api.HiringProcessApi;
import com.eh.employment.api.dto.HiringProcessDto;
import com.eh.employment.api.dto.HiringProcessTableRequest;
import com.eh.employment.service.HiringProcessService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class HiringProcessController implements HiringProcessApi {

    private final HiringProcessService hiringProcessService;

    @Override
    public Page<HiringProcessDto> getHiringProcesses(HiringProcessTableRequest request) {
        return hiringProcessService.getHiringProcesses(request);
    }
}
