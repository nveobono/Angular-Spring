import { Component, OnInit } from '@angular/core';
import { TareasService } from './tareas.service';
import { Tareas} from './Tareas';

@Component({
  selector: 'app-tareas',
  templateUrl: './tareas.component.html',
  styleUrls: ['./tareas.component.css']
})
export class TareasComponent implements OnInit {
  tareas: Tareas[];

  constructor(private tareasService: TareasService) { }

  ngOnInit() {
    this.tareasService.getTareas().subscribe(
      (tareas: any) => {this.tareas = tareas}
    );
  }
  

}
