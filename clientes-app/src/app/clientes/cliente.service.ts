import { Injectable } from '@angular/core';
import { CLIENTES } from './clientes.json';
import { Cliente } from './cliente';

import { of } from 'rxjs/internal/observable/of';
import { Observable } from 'rxjs';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { map } from 'rxjs/operators';


@Injectable({
  providedIn: 'root'
})
export class ClienteService {

  private urlEndPoint: string = 'http://localhost:8080/api/clientes';

  private httpHeaders = new HttpHeaders({'content-type': 'application/json'});

  constructor(private http: HttpClient) { }

  /*getClientesAngular(): Observable<Cliente[]>{
    return of(CLIENTES);
  }*/

  getCliente(): Observable<Cliente[]>{
    return this.http.get(this.urlEndPoint).pipe(
      map((response: any) => response as Cliente[])
    );
  }

  createCliente(cliente: Cliente): Observable<Cliente>{
    return this.http.post<Cliente>(this.urlEndPoint, cliente, {headers: this.httpHeaders})
  }

}
