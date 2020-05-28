#include <cstdlib>

using namespace std;

#include "Robocop.h"
#include "Manifestante.h"
#include "Robot.h"
#include "Policia.h"

Robot *Rob;
Manifestante *Mani;
Policia *Poli;
Ciudadano *Persona;
Robocop *gundan;

int main(int argc, char** argv) {
    gundan=new Robocop();  
    Mani=new Manifestante();
    Poli=new Policia();
    Rob=new Robot();

    Mani->setID("1214199600059");
    Mani->setNombre("Daniel CH");
    Mani->setMotivo("Protesta contra JOH");
    Mani->Lanzar();
    
    Poli->setID("050919991320");
    Poli->setNombre("Jennifer Mendoza");
    Poli->setPlaca("504HN");
	Poli->Lanzar();
   
    Rob->setSerie("CR7");
    
    gundan->setNombre("Miguel Sauceda");
    gundan->setID("51573");
    gundan->setPlaca("T3G");
    gundan->setSerie("AK47");

    gundan->Lanzar();
    
    cout << "\nEl Manifestante " <<Mani->getNombre() <<" con ID: "<<Mani->getID()<<endl;
    cout << "El Policia " <<Poli->getNombre() <<" con ID: "<<Poli->getID()<<endl;
    cout << "El Robocop " <<gundan->getNombre() <<" con ID: "<<gundan->getID()<<" con Placa "<<gundan->getPlaca()<<" con Serie "<<gundan->getSerie()<<endl;
    cout << "El Robot con serie: " <<Rob->getSerie()<<endl;
    cout <<""<<endl;

    Persona=new Robocop();
    Persona->Lanzar();
    cout <<""<<endl;

    Poli=new Robocop();
    Poli->Lanzar();
    cout <<""<<endl;
    return 0;
}
