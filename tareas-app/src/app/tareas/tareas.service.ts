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
    private httpHeaders = new HttpHeaders ({'Content-Type' : 'application/json'});

    constructor(private http: HttpClient, private rou){};

    getTareas():Observable<Tareas[]>{
        return this.http.get(this.urlEndPoint).pipe(
            map(response => response as Tareas[]) 
        );
    }

    getTerea(id): Observable<Tareas>{
        return this.http.get<Tareas>(`${this.urlEndPoint}/${id}`);
    }

    create(tareas: Tareas): Observable<Tareas>{
        return this.http.post<Tareas>(this.urlEndPoint, tareas, {headers: this.httpHeaders}).pipe(
            map((response: any) => response.tareas as Tareas)
        )
    }

    update(tareas: Tareas): Observable<Tareas>{
        return this.http.put<Tareas>(`${this.urlEndPoint}/${tareas.id}`, tareas, {headers: this.httpHeaders}).pipe(
            map((response: any) => response.tareas as Tareas)
        )
    }

    delete(tareas: Tareas): Observable<Tareas>{
        return this.http.delete<Tareas>(`${this.urlEndPoint}/${tareas.id}`, {headers: this.httpHeaders}).pipe(
            map((response: any) => response.tareas as Tareas)
        )
    }
}