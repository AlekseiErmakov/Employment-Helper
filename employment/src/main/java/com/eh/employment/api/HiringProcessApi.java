package com.eh.employment.api;

import com.eh.employment.api.dto.HiringProcessDto;
import com.eh.employment.api.dto.HiringProcessTableRequest;
import org.springframework.data.domain.Page;

public interface HiringProcessApi {

    Page<HiringProcessDto> getHiringProcesses(HiringProcessTableRequest request);
}
