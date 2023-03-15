package com.example.fraud;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class FraudCheckHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "fraud_id_sequence")
    @Column(name = "id", nullable = false)
    private Long id;
    private Integer customerId;
    private Boolean isFraudster;
    private LocalDateTime createdAt;

}
