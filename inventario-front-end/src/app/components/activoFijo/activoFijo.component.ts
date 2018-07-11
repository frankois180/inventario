import { Component, OnInit } from '@angular/core';
import { ActivosFijosService } from '../../services/activosFijos.service';
import { ActivoFijo } from '../../modelo/activoFijos';
import { Estados } from '../../services/GLOBAL';

@Component({
    selector: 'app-activoFijo',
    templateUrl: './activoFijo.component.html',
    providers: [ActivosFijosService]
})
export class ActivoFijoComponent implements OnInit {
    public activoFijo: ActivoFijo;
    public estados: any[];
    public activosFijos: ActivoFijo[];
    public registar: boolean;
    public estado: string;
    public visible: boolean;
    public fechaIncial: Date;
    public fechaFinal: Date;
    public tipoAct: string;
    public serialAct: string;
    public selectEstado;


    constructor(private _activoFijoService: ActivosFijosService) {
        this.estados = Estados;
        this.activoFijo = new ActivoFijo('', '', '', '', '', '', '', '', '', '', '', null, null, '');
        this.selectEstado = Estados[0];
        this.registar = true;
        this.getActivosFijo();
    }

    ngOnInit(): void {
        
    }

    onSubmit() {
        console.log(this.activoFijo);
        if (this.activoFijo.fecha_compra > this.activoFijo.fecha_baja) {
            alert("fecha no puede ser mayor" + this.activoFijo.fecha_compra);
            console.log("fecha no puede ser mayor");
        } else {
            this._activoFijoService.addActivosFijos(this.activoFijo).subscribe(
                (response) => {
                    console.log(response);
                    if (this.estado !== null) {
                        this.estado = "success";
                    } else {
                        this.estado = "error"
                    }

                },
                (error) => {
                    console.log(error);
                    this.estado = "error"
                }
            )
        }
    }
    onUpdate(activoFijo) {
        console.log(activoFijo);
        this._activoFijoService.updateActivosFijos(activoFijo).subscribe(
            (response) => {
                console.log(response);
                if (this.estado !== null) {
                    this.estado = "success";
                } else {
                    this.estado = "error"
                }

            },
            (error) => {
                console.log(error);
                this.estado = "error"
            }
        )
    }



    getActivosFijo() {
        this._activoFijoService.getActivosFijos(this.tipoAct, this.serialAct, this.fechaIncial, this.fechaFinal).subscribe(
            (response) => {
                this.activosFijos = response;
                console.log(this.activosFijos);
            },
            (error) => {
                console.log(error);
            }
        )
    }

    editar(activoFijo) {
        console.log(activoFijo);
        this.activoFijo = activoFijo;
        this.registar = false;
    }

    nuevo(accion: boolean) {
        this.registar = true;
        this.visible = accion;
        this.activoFijo = new ActivoFijo('', '', '', '', '', '', '', '', '', '', '', null, null, '');
    }

    getEstadoActual() {
        this.activoFijo.estado_actual = this.selectEstado.nombre;
    }

    onEliminar(id: any) {
        console.log(id);
        this._activoFijoService.eliminarActivoFijos(id).subscribe(
            (response) => {
                console.log(response);
                this.getActivosFijo();

            },
            (error) => {
                console.log(error);
                this.estado = "error"
            }
        )
    }

}