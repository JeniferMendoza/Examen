#include "Robot.h"

Robot::Robot() {
}

Robot::Robot(const Robot& orig) {
}

Robot::~Robot() {
}
string Robot::getSerie(){
    return Serie;
}
void Robot:: setSerie(string a){
    this->Serie=a;
}
