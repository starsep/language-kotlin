// SYNTAX TEST "source.kotlin" "Quadruple Quotes"
  val valueWithQuadrupleQuotes = Regex(""""."""")
//^^^ source.kotlin storage.type.kotlin
//   ^^^^^^^^^^^^^^^^^^^^^^^^^^ source.kotlin
//                             ^ source.kotlin keyword.operator.assignment.kotlin
//                               ^^^^^ source.kotlin entity.name.type.class.kotlin
//                                     ^^^ source.kotlin meta.group.kotlin string.quoted.triple.kotlin punctuation.definition.string.begin.kotlin
//                                        ^^^ source.kotlin meta.group.kotlin string.quoted.triple.kotlin
//                                           ^^^ source.kotlin meta.group.kotlin string.quoted.triple.kotlin punctuation.definition.string.end.kotlin
  val exampleValueAfterQuotes = 42
//^^^ source.kotlin storage.type.kotlin
//   ^^^^^^^^^^^^^^^^^^^^^^^^^ source.kotlin
//                            ^ source.kotlin keyword.operator.assignment.kotlin
//                               ^^ constant.numeric.integer.kotlin
