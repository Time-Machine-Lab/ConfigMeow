package io.github.timemachinelab.dto;

import lombok.Data;
import java.time.LocalDateTime;

@Data
public class ConfigResponse {
    private Long id;
    private String appName;
    private String environment;
    private String configKey;
    private String configValue;
    private String description;
    private String dataType;
    private Boolean isActive;
    private String createdBy;
    private String updatedBy;
    private LocalDateTime createdTime;
    private LocalDateTime updatedTime;
    private Integer version;
}