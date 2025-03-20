package StockTracker.portfolio;

import java.util.List;

import org.springframework.hateoas.EntityModel;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.hateoas.EntityModel;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;

@RestController
class StockController {

  private final StockRepository repository;

  StockController(StockRepository repository) {
    this.repository = repository;
  }


  // Aggregate root
  // tag::get-aggregate-root[]
  @GetMapping("/stocks")
  List<Stock> all() {
    return repository.findAll();
  }
  // end::get-aggregate-root[]

  @PostMapping("/stocks")
  Stock newStock(@RequestBody Stock newStock) {
    return repository.save(newStock);
  }

  // Single item
  
  @GetMapping("/stocks/{id}")
  EntityModel<Stock> one(@PathVariable Long id) {

        Stock stock = repository.findById(id) //
            .orElseThrow(() -> new StockNotFoundException(id));

        return EntityModel.of(stock, //
            linkTo(methodOn(StockController.class).one(id)).withSelfRel(),
            linkTo(methodOn(StockController.class).all()).withRel("stocks"));
    }

  @PutMapping("/stocks/{id}")
  Stock replaceStock(@RequestBody Stock newStock, @PathVariable Long id) {
    
    return repository.findById(id)
      .map(stock -> {
        stock.setName(newStock.getName());
        stock.setValue(newStock.getValue());
        return repository.save(stock);
      })
      .orElseGet(() -> {
        return repository.save(newStock);
      });
  }

  @DeleteMapping("/stocks/{id}")
  void deleteStock(@PathVariable Long id) {
    repository.deleteById(id);
  }
}