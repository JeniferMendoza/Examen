#ifndef ROBOCOP_H
#define ROBOCOP_H
#include "Policia.h"
#include "Robot.h"

class Robocop: public Policia, public Robot{
public:
    void Lanzar() override;
    Robocop();
    Robocop(const Robocop& orig);
    virtual ~Robocop();
private:

};

#endif /* ROBOCOP_H */

