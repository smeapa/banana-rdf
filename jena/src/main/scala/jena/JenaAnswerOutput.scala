package org.w3.banana.jena

import org.w3.banana._
import com.hp.hpl.jena.sparql.resultset.{ XMLOutput, JSONOutput, OutputFormatter }

/**
 * typeclass for serialising special
 * @tparam T
 */
trait JenaAnswerOutput[T] {
  def formatter: OutputFormatter
}

object JenaAnswerOutput {

  implicit val Json: JenaAnswerOutput[SparqlAnswerJson] =
    new JenaAnswerOutput[SparqlAnswerJson] {
      def formatter = new JSONOutput()
    }

  implicit val XML: JenaAnswerOutput[SparqlAnswerXml] =
    new JenaAnswerOutput[SparqlAnswerXml] {
      def formatter = new XMLOutput()
    }

}

