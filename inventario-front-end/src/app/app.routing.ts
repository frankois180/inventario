import { NgModule } from '@angular/core'
import { Routes, RouterModule } from '@angular/router';
import { AppComponent } from './app.component';
import { InicioComponent } from './components/inicio/inicio.component';
import { ActivoFijoComponent } from './components/activoFijo/activoFijo.component';

const routes : Routes = [
    {path: '', component: InicioComponent},
    {path: 'inicio', component: InicioComponent},
    {path: 'activofijo', component: ActivoFijoComponent}
]

@NgModule({
    imports: [
        RouterModule.forRoot(routes)
    ],
    exports: [
        RouterModule
    ]
})
export class RoutingModule {}
