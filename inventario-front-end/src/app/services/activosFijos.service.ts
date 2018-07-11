import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders, HttpParams } from '@angular/common/http';
import { Observable } from 'rxjs/Observable';
import { GLOBAL } from './GLOBAL';
import { ActivoFijo } from '../modelo/activoFijos';



@Injectable()
export class ActivosFijosService {
    public url: string;

    constructor(private _http: HttpClient) {
        this.url = GLOBAL.url;
    }

    addActivosFijos(activoFijo: ActivoFijo): Observable<any> {
            const body = JSON.stringify(activoFijo);
            const headers = new HttpHeaders().set('Content-type', 'application/json');
            return this._http.post(this.url + 'activoFijo/registrar', body, { headers: headers });
        }
    

    updateActivosFijos(activoFijo: ActivoFijo): Observable<any> {
        const body = JSON.stringify(activoFijo);
        const headers = new HttpHeaders().set('Content-type', 'application/json');
        return this._http.put(this.url + 'activoFijo/actualizar', body, { headers: headers });
    }
 
    
   
    eliminarActivoFijos(activoFijo: ActivoFijo): Observable<any> {

        const params = new HttpParams().append("id", activoFijo.id);

        const headers = new HttpHeaders().set('Content-type', 'application/json');
        return this._http.delete(this.url + 'activoFijo/eliminar', { headers: headers, params: params });
    }

    getActivosFijos(tipoAct: string, serialAct: string, fechaInicial, fechaFinal): Observable<any> {
        let params = new HttpParams();
        if (tipoAct !== undefined) {
            params = params.append('tipo_like', tipoAct);
        }

        if (serialAct !== undefined) {
            params = params.append('serial_like', serialAct);
        }

        if (fechaInicial !== undefined) {
            console.log(fechaInicial);
            params = params.append('fechaInicial', fechaInicial);
        }

        if (fechaFinal !== undefined) {
            console.log(fechaFinal);
            params = params.append('fechaFinal', fechaFinal);
        }


        const headers = new HttpHeaders().set('Content-type', 'application/json');
        return this._http.get(this.url + 'activoFijo/listar', { headers, params: params });
    }


}