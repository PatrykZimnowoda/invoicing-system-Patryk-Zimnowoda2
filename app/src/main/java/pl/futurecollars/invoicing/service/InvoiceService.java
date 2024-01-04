package pl.futurecollars.invoicing.service;

import pl.futurecollars.invoicing.db.Database;
import pl.futurecollars.invoicing.model.Invoice;

public class InvoiceService {

  private final Database database;
  public InvoiceService(Database database) {
    this.database = database;
  }


}
