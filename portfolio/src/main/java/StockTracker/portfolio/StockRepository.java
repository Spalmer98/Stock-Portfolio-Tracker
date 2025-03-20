package StockTracker.portfolio;

import org.springframework.data.jpa.repository.JpaRepository;

interface StockRepository extends JpaRepository<Stock, Long> {

}
