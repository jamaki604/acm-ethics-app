package com.example.acmethicsapp.data

import com.example.acmethicsapp.model.Section

object Chapter2Repository {
    val sections = listOf(
        Section(
            id = "chapter2.1",
            title = "2.1 Strive to achieve high quality in both the processes and products of professional work",
            description = """
                Computing professionals should insist on high-quality work from themselves and colleagues, respecting the dignity and transparency of all stakeholders. Poor quality work that may harm any stakeholder must be avoided, and inducements to neglect this responsibility should be resisted.
            """.trimIndent()
        ),
        Section(
            id = "chapter2.2",
            title = "2.2 Maintain high standards of professional competence, conduct, and ethical practice",
            description = """
                High-quality computing depends on ongoing development of professional competence. This includes:
                - Technical expertise and understanding the social context of work.
                - Communication skills and navigating ethical challenges.
                Professionals should engage in continuous education and skills development through independent study, conferences, and other means.
            """.trimIndent()
        ),
        Section(
            id = "chapter2.3",
            title = "2.3 Know and respect existing rules pertaining to professional work",
            description = """
                Computing professionals must abide by relevant laws, regulations, policies, and procedures unless there is a compelling ethical reason to challenge or violate them. Unethical rules should be addressed through established channels before taking further action, and professionals must accept responsibility for any such decisions.
            """.trimIndent()
        ),
        Section(
            id = "chapter2.4",
            title = "2.4 Accept and provide appropriate professional review",
            description = """
                Professional review is essential to high-quality work. Computing professionals should:
                - Seek peer and stakeholder review whenever appropriate.
                - Provide constructive, critical feedback on others' work to uphold standards.
            """.trimIndent()
        ),
        Section(
            id = "chapter2.5",
            title = "2.5 Give comprehensive and thorough evaluations of computer systems and their impacts, including analysis of possible risks",
            description = """
                Computing professionals should provide objective and thorough evaluations of systems, with attention to:
                - Identifying and mitigating risks.
                - Reassessing risks in machine learning systems and evolving deployments.
                - Reporting major risks to appropriate parties responsibly.
            """.trimIndent()
        ),
        Section(
            id = "chapter2.6",
            title = "2.6 Perform work only in areas of competence",
            description = """
                Computing professionals should evaluate their assignments for feasibility and ensure the work falls within their competence. Lack of expertise should be disclosed to the client or employer, allowing for adjustments or alternative solutions. Ethical judgment is critical in deciding whether to proceed.
            """.trimIndent()
        ),
        Section(
            id = "chapter2.7",
            title = "2.7 Foster public awareness and understanding of computing, related technologies, and their consequences",
            description = """
                Computing professionals should:
                - Share technical knowledge with the public clearly and respectfully.
                - Address impacts, limitations, vulnerabilities, and opportunities of computing systems.
                - Correct inaccurate or misleading information in respectful and clear ways.
            """.trimIndent()
        ),
        Section(
            id = "chapter2.8",
            title = "2.8 Access computing and communication resources only when authorized or when compelled by the public good",
            description = """
                Unauthorized access to systems and data should be avoided unless ethically justified or authorized. Exceptional circumstances may allow disrupting malicious systems, but extraordinary precautions are required to prevent harm.
            """.trimIndent()
        ),
        Section(
            id = "chapter2.9",
            title = "2.9 Design and implement systems that are robustly and usably secure",
            description = """
                Computing professionals must prioritize robust security in system design and implementation by:
                - Preventing breaches through diligence and secure practices.
                - Incorporating monitoring, patching, and vulnerability reporting post-deployment.
                - Designing intuitive and user-friendly security features.
                If misuse or harm is unavoidable, the best course may be not to implement the system.
            """.trimIndent()
        )
    )
}
