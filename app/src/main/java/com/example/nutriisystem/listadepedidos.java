package com.example.nutriisystem;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ExpandableListView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class listadepedidos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listadepedidos);

        ExpandableListView expandableListView = findViewById(R.id.expandableListView);

        HashMap<String, List<String>> item = new HashMap<>();

        ArrayList<String> OTI = new ArrayList<>();
        OTI.add("Caja 10kgs suprema");
        OTI.add("Caja 15kgs suprema");
        OTI.add("Caja 20kgs suprema");
        OTI.add("Caja 10kgs suprema sin congelar");
        OTI.add("Caja 15kgs suprema sin congelar");
        OTI.add("Caja 20kgs suprema sin congelar");

        item.put("OTI", OTI);

        ArrayList<String> Soychu = new ArrayList<>();
        Soychu.add("Caja 10kgs suprema");
        Soychu.add("Caja 15kgs suprema");
        Soychu.add("Caja 20kgs suprema");
        Soychu.add("Caja 10kgs suprema sin congelar");
        Soychu.add("Caja 15kgs suprema sin congelar");
        Soychu.add("Caja 20kgs suprema sin congelar");


        item.put ("Soychu", Soychu);

        ArrayList<String> IceDream = new ArrayList<>();
        IceDream.add("Caja baguetín clásico");
        IceDream.add("Caja baguetín clásico integral");
        IceDream.add("Caja de medialunas");
        IceDream.add("Caja miñón");


        item.put ("IceDream", IceDream);

        ArrayList<String> Emporio = new ArrayList<>();
        Emporio.add("Barra jamón cocido");
        Emporio.add("Horma queso ricotta");
        Emporio.add("Caja choclo congelado");
        Emporio.add("Caja de chaucha congelada");
        Emporio.add("Bolsa de chaucha congelada");
        Emporio.add("Caja de fideos tricolor tirabuzón");
        Emporio.add("Caja de mayonesa suave Hellman's");
        Emporio.add("Caja de Savora");
        Emporio.add("Bidón de vinagre de alcohol");
        Emporio.add("Caja de aceite de girasol");
        Emporio.add("Bidón de aceite de girasol");
        Emporio.add("Caja de aceite de Oliva");
        Emporio.add("Bidón de aceto balsámico");
        Emporio.add("10 kgs de azúcar");
        Emporio.add("Caja de atún natural");
        Emporio.add("Caja de palmitos trozados");
        Emporio.add("Caja de morrón rojo");
        Emporio.add("Balde de aceitunas verdes fileteadas");
        Emporio.add("Caja de sal en sobres");
        Emporio.add("Kilo de cous cous");
        Emporio.add("Kilo de porotos negros");
        Emporio.add("Bidón de miel");
        Emporio.add("1 kg Quinoa");
        Emporio.add("Paquete semillas girasol");
        Emporio.add("Paquete de semillas sésamo blanco");
        Emporio.add("Paquete de semillas de lino");
        Emporio.add("Paquete semillas chía");

        item.put("Emporio", Emporio);

        ArrayList<String> Criollo = new ArrayList<>();
        Criollo.add("Barra jamón cocido");
        Criollo.add("Horma queso ricotta");
        Criollo.add("Caja choclo congelado");
        Criollo.add("Caja de chaucha congelada");
        Criollo.add("Bolsa de chaucha congelada");
        Criollo.add("Caja de fideos tricolor tirabuzón");
        Criollo.add("Caja de mayonesa suave Hellman's");
        Criollo.add("Caja de Savora");
        Criollo.add("Bidón de vinagre de alcohol");
        Criollo.add("Caja de aceite de girasol");
        Criollo.add("Bidón de aceite de girasol");
        Criollo.add("Caja de aceite de Oliva");
        Criollo.add("Bidón de aceto balsámico");
        Criollo.add("10 kgs de azúcar");
        Criollo.add("Caja de atún natural");
        Criollo.add("Caja de palmitos trozados");
        Criollo.add("Caja de morrón rojo");
        Criollo.add("Balde de aceitunas verdes fileteadas");
        Criollo.add("Caja de sal en sobres");
        Criollo.add("Kilo de cous cous");
        Criollo.add("Kilo de porotos negros");
        Criollo.add("Bidón de miel");
        Criollo.add("1 kg Quinoa");
        Criollo.add("Paquete semillas girasol");
        Criollo.add("Paquete de semillas sésamo blanco");
        Criollo.add("Paquete de semillas de lino");
        Criollo.add("Paquete semillas chía");

        item.put("Criollo", Criollo);

        ArrayList<String> Genesis = new ArrayList<>();
        Genesis.add("Paquete de jamón cocido");
        Genesis.add("Pieza de jamón crudo");
        Genesis.add("Queso muzzarella");
        Genesis.add("Caja de queso azul");
        Genesis.add("Horma de queso ricotta");
        Genesis.add("Caja de queso dambo");

        item.put ("Genesis", Genesis);

        ArrayList<String> VerduleríaBeto = new ArrayList<>();
        VerduleríaBeto.add("Cajón de espinaca");
        VerduleríaBeto.add("Cajón de lechuga francesa");
        VerduleríaBeto.add("Paquete de rúcula");
        VerduleríaBeto.add("Maple de huevos");
        VerduleríaBeto.add("Cajón de brócoli");
        VerduleríaBeto.add("Bolsa de zanahoria insturial");
        VerduleríaBeto.add("Cajón tomate redondo");
        VerduleríaBeto.add("Bolsa cebollón");
        VerduleríaBeto.add("Kilo de apio");
        VerduleríaBeto.add("Bolsa de calabaza");
        VerduleríaBeto.add("Bolsa de remolacha sin hoja");
        VerduleríaBeto.add("Kg de Champignon");
        VerduleríaBeto.add("Kg de pepino");
        VerduleríaBeto.add("Kg de frutilla");
        VerduleríaBeto.add("Kg de kiwi");
        VerduleríaBeto.add("Kg de mandarina");
        VerduleríaBeto.add("Unidad de melón dulce");
        VerduleríaBeto.add("Kg de granada");
        VerduleríaBeto.add("Paquete de perejil");
        VerduleríaBeto.add("Cajón palta madura");
        VerduleríaBeto.add("Cajón palta sin madurar");
        VerduleríaBeto.add("Cajón naranja jugo");
        VerduleríaBeto.add("Cajón manzana roja");
        VerduleríaBeto.add("Kg repollo colorado");
        VerduleríaBeto.add("Kg de jalapeños");
        VerduleríaBeto.add("Paquete de albahaca");
        VerduleríaBeto.add("Paquete de menta");
        VerduleríaBeto.add("Kilogramo de morrón");

        item.put("Verdulería Beto", VerduleríaBeto);


        ArrayList<String> VerduleríaAlexis = new ArrayList<>();
        VerduleríaAlexis.add("Cajón de espinaca");
        VerduleríaAlexis.add("Cajón de lechuga francesa");
        VerduleríaAlexis.add("Paquete de rúcula");
        VerduleríaAlexis.add("Maple de huevos");
        VerduleríaAlexis.add("Cajón de brócoli");
        VerduleríaAlexis.add("Bolsa de zanahoria insturial");
        VerduleríaAlexis.add("Cajón tomate redondo");
        VerduleríaAlexis.add("Bolsa cebollón");
        VerduleríaAlexis.add("Kilo de apio");
        VerduleríaAlexis.add("Bolsa de calabaza");
        VerduleríaAlexis.add("Bolsa de remolacha sin hoja");
        VerduleríaAlexis.add("Kg de Champignon");
        VerduleríaAlexis.add("Kg de pepino");
        VerduleríaAlexis.add("Kg de frutilla");
        VerduleríaAlexis.add("Kg de kiwi");
        VerduleríaAlexis.add("Kg de mandarina");
        VerduleríaAlexis.add("Unidad de melón dulce");
        VerduleríaAlexis.add("Kg de granada");
        VerduleríaAlexis.add("Paquete de perejil");
        VerduleríaAlexis.add("Cajón palta madura");
        VerduleríaAlexis.add("Cajón palta sin madurar");
        VerduleríaAlexis.add("Cajón naranja jugo");
        VerduleríaAlexis.add("Cajón manzana roja");
        VerduleríaAlexis.add("Kg repollo colorado");

        item.put("Verdulería Alexis", VerduleríaAlexis);

        ArrayList<String> VerduleríaAranda = new ArrayList<>();
        VerduleríaAranda.add("Cajón de espinaca");
        VerduleríaAranda.add("Cajón de lechuga francesa");
        VerduleríaAranda.add("Paquete de rúcula");
        VerduleríaAranda.add("Maple de huevos");
        VerduleríaAranda.add("Cajón de brócoli");
        VerduleríaAranda.add("Bolsa de zanahoria insturial");
        VerduleríaAranda.add("Cajón tomate redondo");
        VerduleríaAranda.add("Bolsa cebollón");
        VerduleríaAranda.add("Kilo de apio");
        VerduleríaAranda.add("Bolsa de calabaza");
        VerduleríaAranda.add("Bolsa de remolacha sin hoja");
        VerduleríaAranda.add("Kg de Champignon");
        VerduleríaAranda.add("Kg de pepino");
        VerduleríaAranda.add("Kg de frutilla");
        VerduleríaAranda.add("Kg de kiwi");
        VerduleríaAranda.add("Kg de mandarina");
        VerduleríaAranda.add("Unidad de melón dulce");
        VerduleríaAranda.add("Kg de granada");
        VerduleríaAranda.add("Paquete de perejil");
        VerduleríaAranda.add("Cajón palta madura");
        VerduleríaAranda.add("Cajón palta sin madurar");
        VerduleríaAranda.add("Cajón naranja jugo");
        VerduleríaAranda.add("Cajón manzana roja");
        VerduleríaAranda.add("Kg repollo colorado");

        item.put("Verdulería Aranda", VerduleríaAranda);

        ArrayList<String> Jarisch = new ArrayList<>();
        Jarisch.add("Paquetes de semillas");
        item.put("Jarisch", Jarisch);

        ArrayList<String> Taquitas = new ArrayList<>();
        Taquitas.add("Caja de wrap común");
        item.put("Taquitas", Taquitas);

        ArrayList<String> LaMansa = new ArrayList<>();
        LaMansa.add("Caja de aceite de girasol x4");
        LaMansa.add("Horma de ricota");
        item.put("La Mansa", LaMansa);

        ArrayList<String> DonTin = new ArrayList<>();
        DonTin.add("Plancha de Muzzarella 10kgs");
        DonTin.add("Cilindro de muzarella 5kgs");
        DonTin.add("Cilindro de muzzarella 8kgs");
        item.put("Don Tin", DonTin);

        ArrayList<String> SaboresAndinos = new ArrayList<>();
        SaboresAndinos.add("Arroz x20kgs");
        SaboresAndinos.add("Paquete de quinoa");
        SaboresAndinos.add("Paquete de semillas");
        SaboresAndinos.add("Lentejón 25kgs");
        SaboresAndinos.add("Arroz integral yamaní 25kgs");
        SaboresAndinos.add("Quinoa Blanca Real 10kgs");
        SaboresAndinos.add("Mix 4 semillas 10kgs");
        SaboresAndinos.add("CuzCuz Ararat kg");
        SaboresAndinos.add("Garbanzos 10kgs");
        SaboresAndinos.add("Porotos negros 10kgs");
        SaboresAndinos.add("Trigo burgol grueso kg");
        SaboresAndinos.add("Granola premium sin pasas kg");
        item.put("Sabores Andinos", SaboresAndinos);

        ArrayList<String> PasteleríaPróspero = new ArrayList<>();
        PasteleríaPróspero.add("Bolsa de cookies");
        PasteleríaPróspero.add("Muffins de arándanos");
        PasteleríaPróspero.add("Muffins de chocolate");
        PasteleríaPróspero.add("Caja de medialunas de manteca");
        PasteleríaPróspero.add("Budín de naranja 1 unidad");
        PasteleríaPróspero.add("Budín de Limón 1 unidad");
        item.put("Pastelería Próspero", PasteleríaPróspero);

        ArrayList<String> HoracioBebidas = new ArrayList<>();
        HoracioBebidas.add("Agua sierra de los padres s/gas");
        HoracioBebidas.add("Agua sierra de los padres c/gas");
        HoracioBebidas.add("Coca Cola");
        HoracioBebidas.add("Coca Cola Light");
        HoracioBebidas.add("Coca cola Zero");
        HoracioBebidas.add("Sprite Zero");
        HoracioBebidas.add("Levité Pomelo");
        HoracioBebidas.add("Levité Manzana");
        HoracioBebidas.add("Levité Naranja");
        item.put("Bebidas Horacio", HoracioBebidas);

        ArrayList<String> YoguresSancor = new ArrayList<>();
        YoguresSancor.add("Yogur común Vida de Vainilla");
        YoguresSancor.add("Yogus Común Vida de Vainilla Light");
        item.put("Yogures Sancor", YoguresSancor);

        ArrayList<String> PaltasJorge = new ArrayList<>();
        PaltasJorge.add("Paltas maduras");
        PaltasJorge.add("Paltas sin madurar");
        item.put("Paltas Jorge", PaltasJorge);








        MyExpandableListAdapter adapter = new MyExpandableListAdapter(item);
        expandableListView.setAdapter(adapter);

    }
}
