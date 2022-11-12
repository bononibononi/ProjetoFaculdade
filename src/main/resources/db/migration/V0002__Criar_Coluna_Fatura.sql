ALTER TABLE veiculo
add constraint FKVeiculofatura
 foreign key (fatura_id)
  references fatura (id);