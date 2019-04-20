import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Tareas } from './Tareas';
import { map } from 'rxjs/operators';
import { Injectable } from '@angular/core';

@Injectable({
    providedIn: 'root'
})
export class TareasService{
    private urlEndPoint: string = 'http://localhost:8080/api/tareas';
    private httpHeaders = new HttpHeaders({'Content-Type' : 'application/json'});

    constructor(private http: HttpClient){};

    getTareas():Observable<Tareas[]>{
        return this.http.get(this.urlEndPoint).pipe(
            map(response => response as Tareas[]) 
        );
    }

    create(tareas: Tareas): Observable<Tareas>{
        return this.http.post<Tareas>(this.urlEndPoint, tareas, {headers: this.httpHeaders}).pipe(
            map((response: any) => response.tareas as Tareas)
        )
    }
}