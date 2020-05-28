#ifndef CIUDADANO_H
#define CIUDADANO_H
#include <string>
#include <iostream>

using namespace std;

class Ciudadano {
public:
    void setID(string);
    string getID();
    void setNombre(string);
    string getNombre();
    virtual void Lanzar(void)=0;

    Ciudadano();
    Ciudadano(const Ciudadano& orig);
    virtual ~Ciudadano();
private:
    string ID;
    string Nombre;
};
#endif 


