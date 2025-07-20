package com.fabianesilva.events_microservice.repositories;

import com.fabianesilva.events_microservice.domain.Subscription;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubscriptionRepository extends JpaRepository<Subscription, Long> {

}
