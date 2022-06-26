package ru.ventus.aura.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @autor : antontitow {@literal antontitow@bk.ru}
 * @created : 27.06.2022, 1:26
 */
@Entity
@Table(name = "Client")
public class Client {
  @Id private Long employeeId;
  private String firstName;
  private String lastName;
  private String email;
}
