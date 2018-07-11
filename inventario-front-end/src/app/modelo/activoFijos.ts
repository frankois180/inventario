export class ActivoFijo {
    constructor(
        public id,
        public codigo,
        public descripcion,
        public tipo,
        public serial,
        public num_int_inv,
        public peso,
        public alto,
        public ancho,
        public largo,
        public valor_compra,
        public fecha_compra: Date,
        public fecha_baja: Date,
        public estado_actual: string
    ){}
}