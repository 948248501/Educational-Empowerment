object EducationalEmpowerment {
  
  // define function to return the value of the base amount for scholarships
  def baseAmountScholarships(): Double = {
    val amount = 1000.00
    amount
  }
  
  // define function to apply eligibility criteria to candidates
  def applyEligibility(age: Int, gpa: Double): Boolean = {
    if (age >= 18 && gpa >= 3.5) true else false
  }
  
  // define function to calculate scholarship amount for eligible candidates
  def calculateScholarshipAmount(gpa: Double): Double = {
    val baseAmount = baseAmountScholarships()
    var scholarshipAmount = 0.00
    if (gpa > 3.75) {
      scholarshipAmount = baseAmount + 500.00
    }
    else {
      scholarshipAmount = baseAmount + 200.00
    }
    scholarshipAmount
  }
  
  // define main function
  def main(args: Array[String]): Unit = {
    val age = 19
    val gpa = 3.9
    val eligibilityStatus = applyEligibility(age, gpa)
    var scholarshipAmount = 0.00
    if (eligibilityStatus) {
      scholarshipAmount = calculateScholarshipAmount(gpa)
      println("Congrats! You are eligible for the scholarship amount of " + scholarshipAmount + "$")
    }
    else {
      println("Sorry you are not eligible for the scholarship!")
    }
  }
}