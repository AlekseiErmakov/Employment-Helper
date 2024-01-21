package com.eh.employment.api.dto;

import java.time.ZonedDateTime;

public record HiringProcessDto(Long id,
                               String position,
                               String company,
                               String country,
                               String city,
                               String language,
                               String status,
                               Boolean important,
                               ZonedDateTime created,
                               ZonedDateTime updated
) {

}
