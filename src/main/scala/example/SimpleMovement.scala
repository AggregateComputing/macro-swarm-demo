package example

import it.unibo.scafi.macroswarm.MacroSwarmAlchemistSupport._
import it.unibo.scafi.macroswarm.MacroSwarmAlchemistSupport.incarnation._
import it.unibo.scafi.space.Point3D

class SimpleMovement extends MacroSwarmProgram // define a program that supports the movement in alchemist env
  with StandardSensors with TimeUtils // standard AC API (sensing and time)
  with ScafiAlchemistSupport // helper for alchemist
  // library for basic movement
  with BaseMovementLib {

  override protected def movementLogic(): Point3D = brownian()
}