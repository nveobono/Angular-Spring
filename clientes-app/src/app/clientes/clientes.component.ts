import { Component, OnInit } from '@angular/core';
import { Cliente } from './cliente';
import { ClienteService } from './cliente.service';

@Component({
  selector: 'app-clientes',
  templateUrl: './clientes.component.html'
})
export class ClientesComponent implements OnInit {

  clientes: Cliente[];

  constructor(private clienteService: ClienteService) { }

  ngOnInit() {
    /*this.clienteService.getClientesAngular().subscribe(
      (clientes:any) => {
        this.clientes = clientes
      });*/
    this.clienteService.getCliente().subscribe(
      (clientes:any) => {
        this.clientes = clientes
      });    
  }

}
