package com.example.acmethicsapp.data

import com.example.acmethicsapp.model.Section

object Chapter1Repository {
    val sections = listOf(
        Section(
            id = "chapter1.1",
            title = "1.1 Contribute to society and to human well-being",
            description = """
                A computing professional should contribute to society and human well-being by acknowledging that all people are stakeholders in computing. This principle emphasizes:
                - Using skills for societal and environmental benefit.
                - Promoting fundamental human rights and protecting individual autonomy.
                - Minimizing negative consequences like threats to health, safety, and privacy.
                - Giving priority to the needs of disadvantaged groups when conflicts arise.
                Computing professionals are encouraged to engage in pro bono work and promote environmental sustainability locally and globally.
            """.trimIndent()
        ),
        Section(
            id = "chapter1.2",
            title = "1.2 Avoid harm",
            description = """
                A computing professional should avoid harm by:
                - Identifying and mitigating unintended consequences.
                - Ensuring any harm caused is ethically justified and minimized.
                - Following best practices and carefully analyzing emergent system properties.
                - Reporting system risks and, if necessary, whistleblowing responsibly to reduce harm.
                Careful consideration of potential impacts on all affected parties is crucial in avoiding harm.
            """.trimIndent()
        ),
        Section(
            id = "chapter1.3",
            title = "1.3 Be honest and trustworthy",
            description = """
                Honesty and trustworthiness are essential qualities for computing professionals. This includes:
                - Transparent communication of system capabilities, limitations, and potential issues.
                - Honoring commitments and being truthful about qualifications and competence.
                - Avoiding conflicts of interest and misrepresentation of organizations or policies.
                Computing professionals should build trust through honesty and integrity.
            """.trimIndent()
        ),
        Section(
            id = "chapter1.4",
            title = "1.4 Be fair and take action not to discriminate",
            description = """
                Fairness and non-discrimination are critical for computing professionals. This involves:
                - Ensuring equality, tolerance, respect, and justice in decision-making.
                - Promoting diversity and inclusion in technology development.
                - Designing accessible systems to avoid inequities or oppression.
                Failure to consider inclusivity can constitute unfair discrimination.
            """.trimIndent()
        ),
        Section(
            id = "chapter1.5",
            title = "1.5 Respect the work required to produce new ideas, inventions, creative works, and computing artifacts",
            description = """
                Respect for creators' efforts is essential. Computing professionals should:
                - Credit creators and respect copyrights, patents, and other protections.
                - Support reasonable uses of intellectual works for public good.
                - Contribute to society through open-source projects and public domain efforts.
                Private ownership should not be claimed for publicly shared work.
            """.trimIndent()
        ),
        Section(
            id = "chapter1.6",
            title = "1.6 Respect privacy",
            description = """
                Respecting privacy is a profound responsibility for computing professionals. Key aspects include:
                - Using personal data only for legitimate ends while protecting individual rights.
                - Ensuring transparent policies for data collection, retention, and disposal.
                - Preventing re-identification of anonymized data and unauthorized access.
                Privacy considerations are critical when merging data collections or developing systems.
            """.trimIndent()
        ),
        Section(
            id = "chapter1.7",
            title = "1.7 Honor confidentiality",
            description = """
                Computing professionals are entrusted with confidential information and must:
                - Protect it unless there is evidence of violations of law, organizational policies, or the Code.
                - Disclose information thoughtfully and only to appropriate authorities if necessary.
                Confidentiality is a cornerstone of professional responsibility and trust.
            """.trimIndent()
        )
    )
}
