import { Component, OnInit } from '@angular/core';
import { Cliente } from './cliente';
import { ClienteService } from './cliente.service';
import { Router, ActivatedRoute } from '@angular/router';
import swal from 'sweetalert2';

@Component({
  selector: 'app-formulario',
  templateUrl: './formulario.component.html'
})
export class FormularioComponent implements OnInit {

  private cliente: Cliente = new Cliente();
  private titulo: string = 'Crear Cliente';

  constructor(private clienteService: ClienteService, private router: Router, private activatedRoute: ActivatedRoute) { }

  ngOnInit() {
    this.cargarCliente()
  }

  public cargarCliente(): void{
    this.activatedRoute.params.subscribe((params: any) => {
      let id = params['id']
      if(id){
        this.clienteService.getCliente(id).subscribe( (cliente: any) => this.cliente = cliente)
      }
    })
  }

  public create(): void{
    this.clienteService.create(this.cliente).subscribe(
      cliente => {
        this.router.navigate(['/clientes'])
        swal.fire('Nuevo Cliente', `Cliente ${cliente.nombre} ha sido creado con exito`, 'success')
      });
    console.log("clicked");
    console.log(this.cliente);
  }

  public update(): void{
    this.clienteService.update(this.cliente).subscribe( 
      (cliente: any) => {
        this.router.navigate(['/clientes'])
        swal.fire('Cliente Actaulizado', `Clinete ${cliente.nombre} ha sido actualidado con exito`, 'success')
      })
  }
}
