package com.github.wezmoreira.pagamento.dto.pagamento.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RequestToken {
    private String client_id;
    private String api_key;
}
