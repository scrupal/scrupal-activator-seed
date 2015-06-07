package org.example

import java.net.URL

import scrupal.core.api._
import scrupal.utils.{ Version, OSSLicense }

/** An Example Scrupal Module (replace)
  *
  * Describe your module here.
  */
class ExampleModule extends Module {

  override def id : Symbol = 'Example // Specify the unique name of your module

  override def description : String = "Example Module" // Provide a simple & short description of your module here

  override def version : Version = Version(0, 1, 0) // Specify the version number of this module

  override def obsoletes : Version = Version(0, 0, 0) // Specify the prior version number this version obsoletes

  override def author : String = "Alan Turing" // Specify the name of the author (person or legal entity)

  override def copyright : String = "Copyright 2015 MI-6. All rights reserved." // Specify a one-line copyright notice

  override def license : OSSLicense = OSSLicense("Apache2", "Apache 2.0 License", "http://www.apache.org/licenses/LICENSE-2.0")

  override def moreDetailsURL : URL = new URL("http://example.org/path/to/your/module") // Put a URL to your

  override def features : Seq[Feature] = Seq.empty[Feature] // List the features your module can enable/disable

  override def entities : Seq[Entity] = Seq.empty[Entity] // List the entitites your module defines

  override def nodes : Seq[Node] = Seq.empty[Node] // List the node types your module defines

  override def types : Seq[Type] = Seq.empty[Type] // List the fundamental data types your module defines

  override def handlers : Seq[HandlerFor[Event]] = Seq.empty[HandlerFor[Event]] // List the event handlers your module adds

}
