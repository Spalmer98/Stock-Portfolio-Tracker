package StockTracker.portfolio;

class StockNotFoundException extends RuntimeException {

  StockNotFoundException(Long id) {
    super("Could not find stock " + id);
  }
}